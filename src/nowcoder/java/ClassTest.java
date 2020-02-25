package nowcoder.java;

/**
 * java中都是按栈中的值传递，基本数据类型栈中的值就是实际存储的值，引用类型栈中的值就是指向堆中的地址
 * 1）String和char[ ]都是引用类型，所以在方法中传递的都是指向真实数据的地址
 * 2）假设String str指向的hello的地址为d1，str传递到fun函数中的也是地址d1，成员变量str和fun的形参str不是同一个变量，把fun型中的str赋值为world只是修改了该str指向的地址，该地址由d1更改成了world的地址，并没有改变成员变量str指向的地址及堆中的数据，所以str还是hello。
 * 3）假设char[ ] ch指向的abc的地址是d2，传递到fun函数中的地址也是d2，同上成员变量ch和fun的形参ch不是同一个变量，(1)如果把fun中的ch[0]='d'更改为ch = new ch[3]；ch[0]='d',那么成员变量ch的值是没有变化的，还是abc,原理同上String，只是改变了引用ch指向的堆数据的地址，并没有改变成员变量ch指向的地址以及堆中的数据。（2）改变了堆中的数据，所以最终结果编程dbc，此ch只是形参而不是成成员变量ch，如果对ch变化对成员变量ch没有影响，但是ch[i]指向了堆数据的地址，直接修改堆数据，所以成员变量变了。
 */
public class ClassTest{
    String str = new String("hello");
    char[] ch = {'a','b','c'};
    public void fun(String str, char ch[]){
        str="world";
        ch[0]='d';
    }
    public static void main(String[] args) {
        ClassTest test1 = new ClassTest();
        test1.fun(test1.str,test1.ch);
        System.out.print(test1.str + " and ");
        System.out.print(test1.ch);
    }
}