import kotlin.math.max

open class Vehicle
{
    // private
    // protected
    // internal
    // public

    private var currentSpeed: Int;
    public var maxSpeed: Int;
    protected var model: String;

    init
    {
        println("Hello There");
        currentSpeed = 0;
        maxSpeed = 120;
        model = "";
    }

    constructor()
    {
        println("Secondary Constructor");
    }

    fun SetModel(m: String)
    {
        model = m;
    }

    fun SetCurrentSpeed(speed: Int)
    {
        if (speed >= 0 && speed <= maxSpeed)
        {
            currentSpeed = speed;
        }
    }

    open fun SetMaxSpeed(speed: Int)
    {
        println("Parent method");
        maxSpeed = speed;
    }

    fun GetCurrentSpeed(): Int
    {
        return currentSpeed;
    }
}

class Car: Vehicle()
{
    var testVar = "Hello World";

    fun Test()
    {
        model = "model";
        println("Yay");
    }

    override fun SetMaxSpeed(speed: Int)
    {
        println("Overriden method");
        maxSpeed = speed / 2;
    }
}

fun main(args: Array<String>)
{
    /*var v1 = Vehicle();
    var v2 = Vehicle();

    v1.SetModel("BMW");
    v1.SetMaxSpeed(20);*/


    /*println(v1.GetCurrentSpeed());
    println(v1.model);
    println(v1.maxSpeed);

    println(v2.model);
    println(v2.maxSpeed);*/

    var car = Car();

    car.Test();
    println(car.GetCurrentSpeed());

    println(car.maxSpeed);

    car.SetMaxSpeed(190);

    println(car.maxSpeed);
}
