package au.com.uniquewebsitehostname.userdetails.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "User Details API", version = "v1"))
@SecurityScheme(
        name = DocumentationConfiguration.BASIC_SECURITY_SCHEME_NAME,
        type = SecuritySchemeType.HTTP,
        scheme = "basic"
)
public class DocumentationConfiguration {
    public static final String BASIC_SECURITY_SCHEME_NAME = "basicAuth";
}
