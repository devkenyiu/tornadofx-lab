module tornadofx.lab {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires tornadofx;
    requires kotlin.stdlib;

    exports dev.kenyiu.demo.app to javafx.graphics, tornadofx;
    exports dev.kenyiu.demo.view to tornadofx;
}