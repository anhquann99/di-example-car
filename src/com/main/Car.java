package com.main;

import com.car.Engine;
import com.car.Wheel;
import com.interfacee.IEngine;
import com.interfacee.IWheel;

public class Car {
    public IEngine iEngine;
    public IWheel iWheel;

    public Car(IEngine iEngine, IWheel iWheel) {
        this.iEngine = iEngine;
        this.iWheel = iWheel;
    }

    public static void main(String[] args) {
        // DI một cách đơn giản nhất
        Car myCar = new Car(new Engine(), new Wheel());
        System.out.println(myCar);

        // Khi cần thay đổi loại xe
        // myCar = new Car(new superEngine(),new superWheel();
    }
}
