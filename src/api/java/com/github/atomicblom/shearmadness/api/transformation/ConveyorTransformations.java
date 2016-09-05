package com.github.atomicblom.shearmadness.api.transformation;

import com.github.atomicblom.shearmadness.api.rendering.PartDefinition;
import com.github.atomicblom.shearmadness.api.rendering.QuadrupedTransformDefinition;
import org.lwjgl.util.vector.Matrix3f;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public class ConveyorTransformations extends QuadrupedTransformDefinition
{
    @Override
    public void defineParts()
    {
        super.defineParts();

        /*final Matrix4f trackRotation = new Matrix4f()
                .rotate((float)Math.toRadians(30), new Vector3f(0, 0, 1));
                //.rotate(-NintyDegrees, new Vector3f(1, 0, 0));*/

        final Matrix4f trackRotation = new Matrix4f()
                .rotate((float) Math.toRadians(-90), new Vector3f(1, 0, 0))
                .rotate((float) Math.toRadians(165), new Vector3f(0, 1, 0))
                ;

        bodyPartDefinition = new PartDefinition(
                new Vector3f(0.0f, 5.0f, 2.0f),
                Matrix4f.mul(
                        trackRotation,
                            createPartMatrix(
                                    new Vector3f(12, 20, 14), //Size of the body
                                    new Vector3f(0, -8, -1)), //translation
                        null
                ),
                new Matrix3f()
        );

        final Matrix4f rotate = new Matrix4f()
                .rotate((float) Math.toRadians(90), new Vector3f(0, 1, 0))
                .rotate((float) Math.toRadians(90), new Vector3f(0, 1, 0));

        headPartDefinition = new PartDefinition(
                new Vector3f(0.0f, 6.0f, -8.0f),
                Matrix4f.mul(
                        rotate,
                            createPartMatrix(
                                    new Vector3f(8, 8, 8),
                                    new Vector3f(0, -7, 2.3f)),
                        null
                ),

                new Matrix3f()
        );

        leg1PartDefinition = null;
        leg2PartDefinition = null;
        leg3PartDefinition = null;
        leg4PartDefinition = null;
    }
}
