package org.immunizer.instrumentation.response;

import net.bytebuddy.asm.Advice;

public class ResponseMethodAdvice {

    @Advice.OnMethodEnter
    public static void onEnter(@Advice.Origin String fullyQualifiedMethodName,
            @Advice.AllArguments Object[] params) throws Exception {

        throw new Exception();
    }

    public static void onExit() {			
        // Do nothing here
    }
}