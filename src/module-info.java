module WorldClock {
	exports com.jdc.wc;
	requires javafx.controls;
	requires transitive javafx.graphics;
	requires javafx.fxml;
	opens com.jdc.wc to javafx.fxml;
}