import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.IOException;

/**
 * Created by ggikko on 2016. 12. 28..
 */
public class HelloWorld {

    public static void main(String[] args) throws Exception {
        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
                .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(whatsMyName("ggikko"))
                .addMethod(whatsMyName("park"))
                .addMethod(whatsMyName("jihong"))
                .build();

        JavaFile javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
                .build();

        javaFile.writeTo(System.out);
    }

    private static MethodSpec whatsMyName(String name) {
        return MethodSpec.methodBuilder(name)
                .returns(String.class)
                .addStatement("return $S", name)
                .build();
    }
}
