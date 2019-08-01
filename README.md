# API基础 
String类 Math类
  
    1. String类
    
    字符串类
	  tring类被final修饰符修饰类，即最终类；
	  用于存放字符序列的数组也被final修饰，最终变量；
	  字符串的值发生改变时，会创建一个新的字符串对象
	
	常用构造方法：
		String（）；
		String（String str）；
		String（byte[] bytes）；
		String（byte[] bytes，
		
	常用方法：
		subString（）返回一个字符串
		toCharArray（）将此字符串转换为新的字符数组
		Split（）将字符串根据指定的正则表达式分割
		toLowerCase()将字符串转换为小写
		toUpperCase()将字符串转换为大写
		
	pattern类	正则表达式编译后的表现形式，正则表达式必须首先被编译为此类的实例
	matcher类	执行匹配操作的匹配器，通过解析patter对象获得
	
	2. Math类
	数学函数类，类中提供解决数学问题的方法。
	math是个最终类，被final修饰符修饰
	math类的构造方法是私有的，不能实例化对象，不能被继承
	math类中，所有的方法均是静态的
	
	ceil（）返回大于或等于的一个double数，向上取整
	floor（）返回小于或者等于的一个double数，向下取整
	Round（）四舍五入的返回整数
	random（）返回一个0~1的随机数，大于或者等于0，小于1
