package jdk;

import java.util.List;
import java.util.Set;

public class Testjdk9 {
	/**
	 * jdk 1.9 新特性
	 * 1.java 平台及模块系统：
	 * 	当启动一个模块应用时，jvm 会验证是否所有的模块都能使用，这基于“requires"
	 * 语句--比脆弱的类路径迈进了一大步。模块允许你更好地强制结构化封装你的应用并明确依赖。
	 * 2.linking 
	 *  当你使用具有显式依赖关系的模块和模块化的 JDK 时，新的可能性出现了。
	 *  你的应用程序模块现在将声明其对其他应用程序模块的依赖以及对其所使用的 JDK
	 *   模块的依赖。为什么不使用这些信息创建一个最小的运行时环境，
	 *  其中只包含运行应用程序所需的那些模块呢？ 这可以通过 Java 9 中的新的 jlink
	 *   工具实现。你可以创建针对应用程序进行优化的最小运行时映像而不需要使用完全加载 
	 *   JDK 安装版本。
	 *3.Jshell ：交互式java REPL
	 *  许多语言已经具有交互式编程环境，Java 现在加入了这个俱乐部。
	 *  您可以从控制台启动 jshell ，并直接启动输入和执行 Java 代码。 
	 *  jshell 的即时反馈使它成为探索 API 和尝试语言特性的好工具
	 *  
	 *4.改进的 Javadoc
	 *
	 *5.集合工厂方法
	 *
	 *  Set<Integer> ints = Set.of(1,2,3);

		List<String> strings = List.of("first","second");
		
	 *6.改进的 Stream API
	 *
	 *7.私有接口方法
	 *如果您使用默认方法开发 API ，那么私有接口方法可能有助于构建其实现。
	 *
	 *
	 *8.HTTP/2
	 *
	 *9.多版本兼容 JAR
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		//无法测试
	}

}
