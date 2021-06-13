package shablovskiy91.exam.dz;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("shablovskiy91.exam.dz")
@Import(PropertiesConfiguration.class)
public class ExamConfig {
}
