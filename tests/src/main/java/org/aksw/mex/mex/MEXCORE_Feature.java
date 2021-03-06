package org.aksw.mex.mex;

import org.aksw.mex.MethodAnnotation;
import org.aksw.mex.mex.types.FieldAnnotation;
import org.aksw.mex.mex.types.ParameterAnnotation;
import org.aksw.mex.mex.types.TypeAnnotation;

/**
 * Created by dnes on 14/12/15.
 */
@TypeAnnotation
public class MEXCORE_Feature {
    @FieldAnnotation(value = "p1")
    public Object object1;

    @FieldAnnotation(value = "p2")
    public Object object2;

    @MethodAnnotation
    public Object setObject(@ParameterAnnotation("meuparametro") final Object object){
        this.object1 = object;
        return this;
    }
}
