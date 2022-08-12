package ticket.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import ticket.dao.AbstractDao;
import ticket.dao.RoleDao;
import ticket.exception.DataProcessingException;
import ticket.model.Role;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory, Class<Role> clazz) {
        super(factory, clazz);
    }

    @Override
    public Optional<Role> getByName(String roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> query = session
                    .createQuery("FROM Role r WHERE r.role = :roleName", Role.class);
            query.setParameter("name", Role.RoleName.valueOf(roleName));
            return query.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get role by name: " + roleName, e);
        }
    }
}
