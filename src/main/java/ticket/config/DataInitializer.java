package ticket.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ticket.model.Role;
import ticket.model.User;
import ticket.service.RoleService;
import ticket.service.UserService;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("bob@i.ua");
        user.setPassword("12345");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
    }
}
