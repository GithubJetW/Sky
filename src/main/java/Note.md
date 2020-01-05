第12章 充分利用现有对象
1，建立继承
在子类中使用this和super：
关键字this用于引用当前队形。创建类时，要引用根据该类创建的特定对象，可使用this。
    this.title = “Cagney”
这条语句将对象的title变量设置为Cagney。
关键字super的用途与此类似：引用对象的上一级超类。有以下几种方式使用super
    引用超类的构造函数。如 super("Adam", 12);
    引用超类的变量。如 super.hawaii = 50;
    引用超类的方法。如 super.dragner();

使用关键字super的方式之一是在子类的构造函数中。子类从其超类继承所有的行为和属性，因此将子类的构造函数与超类的构造函数关联起来，否则有些行为和属性可能不能正确设置。
导致子类不能正常工作。
为此，在子类的构造函数中，第一条语句必须调用超类的构造函数，因此需要使用关键字super，如下：
    public readFiles(String name, int length) {
        super(name, length);
    }
这是子类的构造函数，它使用super(name, length)调用超类相应的构造函数。
如果不适用super调用超类的构造函数，则在子类构造函数执行时，Java将自动调用无参数的超类狗在函数。
如果该超类构造函数不存在，或提供了意料之外的行为，将导致错误，因此最好手工调用超类的构造函数/


12.4 将相同类型的对象存储到Vector中
Vector类似于数组，也存储相关的数据。但其长度可动态的增减。
Vector类位于java.util包中，这是Java类库中最有用的i个包。在程序中使用它，可使用一条import语句：
    import java.util.Vector;
Vector存储的对象要么属于同一个类，要么有相同的超类。要创建Vector，需要使用两个类：
    Vector和要存储在Vector的类。
将要在Vector中存储的类的名称凡在"<"和">"之间，如下：
    Vector<String> victor = new Vector<String>();

