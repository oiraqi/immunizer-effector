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
}
