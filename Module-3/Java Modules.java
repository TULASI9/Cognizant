/com.utils
    /com/utils/Utils.java
    module-info.java
/com.greetings
    /com/greetings/Main.java
    module-info.java


  module com.utils {
    exports com.utils;
}


package com.utils;

public class Utils {
    public static String getMessage() {
        return "Hello from utils!";
    }
}



module com.greetings {
    requires com.utils;
}
//main.java

  package com.greetings;

import com.utils.Utils;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.getMessage());
    }
}

