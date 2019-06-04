package com.sona.bootcube;

import com.sona.bootcube.Factory.CombinationContextFactory;
import com.sona.bootcube.Impl.CombinationContext;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BootCubeApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootCubeApplication.class, args);
	}

	private volatile static boolean isExit = false;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		while (!isExit){
			System.out.println("Please input array or digits. For example 2,3 or 99");
			String inputString = scanner.nextLine();

			CombinationContext context = CombinationContextFactory.getContext(inputString);
			if (null != context) {System.out.println(context.executeStrategy(inputString));
			}

			System.out.println("Do you want to exit? Y/N");
			String exit = scanner.nextLine();
			if(exit.equalsIgnoreCase("y")){
				isExit = true;
			}
		}
	}
}
