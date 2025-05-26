import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.Usuario;

public class Gerenciador_projetoAPP {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        Usuario usuario1 = new Usuario(1, "ronald@gmail.com",
                "Ronald123", "1234");

        Usuario usuario2 = new Usuario(2, "jef@gmail.com",
                "Jef123", "5678");

        //Persistir no BD(banco de dados)

        em.getTransaction().begin();
        em.persist(usuario1);
        em.persist(usuario2);
        em.getTransaction().commit();

    }
}
