### Order.java
```java
package com.cafe.order;
import com.cafe.menu.*;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    public void add(OrderItem item) {
        items.add(item);
    }

    public int cost() {
        int cost = 0;
        for (OrderItem i : items) {
            cost += (i.beverage.getprice() * i.getQuantity());
        }
        return cost;
    }

    public boolean setSize(String name, String size) {
        for (OrderItem i : items) {
            if (name.equals(i.beverage.getName())) {
                return i.beverage.setSize(size);
            }
        }
        return false;
    }

    public void print() {
        for (OrderItem i : items) {
            System.out.println(i);
        }
        System.out.printf("Total: %,d%n", cost());
    }
}

```

### OrderItem.java
```java
package com.cafe.order;
import com.cafe.menu.*;
public class OrderItem {
    Beverage beverage;
    int quantity;

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    public String toString() {
        String msg = "[ name=" + beverage.getName() + ", Price=" + beverage.getprice()
                + ", size=" + beverage.getsize() + ", quantity=" + quantity + " ]";
        return msg;
    }

    public int getQuantity() {
        return quantity;
    }
}

```

### Blended.java
```java
package com.cafe.menu;

public class Blended extends Beverage{
    private int baseAmount;

    public Blended(String name) {
        this.name = name;
        this.basePrice = 6800;
        this.size = GRANDE;
        baseAmount = GRANDE;
    }

    public boolean setSize(int size) {
        if(size >= GRANDE) {
            if (size > baseAmount)
                baseAmount += 500;
            return super.setSize(size);
        }
        return false;
    }
}

```

### Coffee.java
```java
package com.cafe.menu;

public class Coffee extends Beverage {
    private int defaultShot;

    public Coffee (String name) {
        this.name = name;
        this.basePrice = 4100;
        this.size = TALL;
        defaultShot = TALL;
    }

    public boolean setSize(int size) {
        this.size = size;
        if (size > defaultShot)
            basePrice += 500;
        else if (size < defaultShot)
            basePrice -= 500;
        return true;
    }
}

```

### Teavana.java
```java
package com.cafe.menu;

public class Teavana extends Beverage{
    private int amount;

    public Teavana(String name) {
        this.name = name;
        this.basePrice = 4100;
        this.size = TALL;
        amount = TALL;
    }

    public boolean setSize(int size) {
        if(size!=GRANDE) {
            if (amount > size)
                basePrice -= 500;
            else if (amount < size)
                basePrice += 500;
            return super.setSize(size);
        }
        return false;
    }
}
```

### Beverage.java
```java
package com.cafe.menu;

public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    String name; int basePrice; int size;

    public boolean setSize(String size) {
        if ("TALL".equals(size))
            return setSize(TALL);
        else if ("GRANDE".equals(size))
            return setSize(GRANDE);
        else if ("VENTI".equals(size))
            return setSize(VENTI);
        return false;
    }

    public boolean setSize(int size) {
        this.size = size;
        return true;
    }

    public String getName() {
        return name;
    }
    public int getprice() {
        return basePrice;
    }
    public String getsize() {
        String s = new String();
        if(size == TALL)
            s += "TALL";
        else if(size == GRANDE)
            s += "GRANDE";
        else if (size == VENTI)
            s += "VENTI";
        return s;
    }
}
```
