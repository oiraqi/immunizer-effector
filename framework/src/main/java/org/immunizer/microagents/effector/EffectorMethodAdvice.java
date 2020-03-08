package org.immunizer.microagents.effector;

import com.google.common.hash.Hashing;

import net.bytebuddy.asm.Advice;

public class EffectorMethodAdvice {

    private static AlarmManager alarmManager = AlarmManager.getSingleton();

    @Advice.OnMethodEnter
    public static void onEnter(@Advice.Origin String fullyQualifiedMethodName, @Advice.AllArguments Object[] params)
            throws Exception {

        StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
        StringBuffer sb = new StringBuffer();
        for (StackTraceElement stackElement : callStack) {
            sb.append(stackElement.toString());
            sb.append("\n");
        }
        int callStackId = Math.abs(Hashing.adler32().hashBytes(sb.toString().getBytes()).asInt());
        if (alarmManager.isAttack(callStackId, params)) {
            throw new Exception();
        }
    }
}