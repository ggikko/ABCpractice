package me.ggikko.codegen;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Created by ggikko on 2016. 12. 29..
 */
@SupportedAnnotationTypes("me.ggikko.Merong")
public class MerongProcessor extends AbstractProcessor {
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
//        Collection<? extends Element> annotatedElements =
//                env.getElementsAnnotatedWith(Merong.class);

        // We are the only ones handling AutoParcel annotations
        return true;
    }
}
