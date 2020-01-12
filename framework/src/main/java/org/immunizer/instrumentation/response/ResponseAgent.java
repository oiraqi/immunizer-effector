package org.immunizer.instrumentation.response;

import java.lang.instrument.Instrumentation;
/*import java.time.Duration;

import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.utility.JavaModule;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.agent.builder.AgentBuilder.Transformer;*/
import net.bytebuddy.asm.Advice;
/*import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatcher.Junction;

import static net.bytebuddy.matcher.ElementMatchers.*;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;*/

public class ResponseAgent {
	public static void premain(String arg, Instrumentation inst) throws Exception {
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("Response Microagent Launched!");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		// AgentBuilder builder = new AgentBuilder.Default().ignore(nameStartsWith("net.bytebuddy."));

		
		new Thread(new Runnable() {
			@Override
			public void run() {
				/*AlarmConsumer consumer = new AlarmConsumer();
				ConsumerRecords<String, Alarm> records;
				while (true) {
					records = consumer.poll(Duration.ofSeconds(60));
					for (ConsumerRecord<String, Alarm> record : records) {
						
					}
				}*/
			}
		}).start();
	}

	/*private static class ResponseTransformer implements Transformer {

		Junction<? super MethodDescription> matcher;

		public ResponseTransformer(Junction<? super MethodDescription> matcher) {
			ElementMatcher<Iterable<? extends ParameterDescription>> parameterMatcher = parameterDescriptions -> {
				return (parameterDescriptions != null && parameterDescriptions.iterator().hasNext());
			};

			this.matcher = matcher.and(isPublic()).and(hasParameters(parameterMatcher));
		}

		@Override
		public DynamicType.Builder<?> transform(final DynamicType.Builder<?> builder,
				final TypeDescription typeDescription, final ClassLoader classLoader, final JavaModule module) {

			return builder.method(matcher).intercept(Advice.to(ResponseAdvice.class));
		}
	}*/

	public static class ResponseAdvice {

		@Advice.OnMethodEnter
		public static void onEnter(@Advice.Origin String fullyQualifiedMethodName,
				@Advice.AllArguments Object[] params) throws Exception {

			throw new Exception();
		}

		public static void onExit() {			
			// Do nothing here
		}
	}
}
