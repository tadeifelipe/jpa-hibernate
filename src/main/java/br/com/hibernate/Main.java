package br.com.hibernate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
//        Lembrete lembrete = new Lembrete();
//        lembrete.setTitulo("Comprar leite");
//        lembrete.setDescricao("Hoje 10h30");
//
//        List<Lembrete> lembretes = null;

        EntityManager em = entityManagerFactory.createEntityManager();
//        Lembrete lembrete = null;

//      ** Persistindo dados no banco **
//        try{
//            em.getTransaction().begin();
//            em.persist(lembrete);
//            em.getTransaction().commit();
//        }catch (Exception e){
//            em.getTransaction().rollback();
//        }finally {
//            em.close();
//        }

//        ** Recuperando dados do banco **
//        try{
//            lembretes = em.createQuery("from Lembrete").getResultList();
//        }catch (Exception e){
//            System.out.println("Erro?: " + e.getMessage());
//        }finally {
//            em.close();
//        }
//
//        if(lembretes != null){
//            lembretes.forEach(System.out::println);
//        }

//       ** Filtrar um único registro **
//        try{
//            lembrete = em.find(Lembrete.class,1L);
//            System.out.println(lembrete);
//        }catch (Exception e){
//            System.out.println("Erro?: " + e.getMessage());
//        }finally {
//            em.close();
//        }

//       ** Listando por uma determinada coluna **
//        try{
//            lembretes = em.createQuery("from Lembrete l where l.titulo LIKE '%buscar%'").getResultList();
//        }catch (Exception e){
//            System.out.println("Erro?: " + e.getMessage());
//        }finally {
//            em.close();
//        }
//
//        if(lembretes != null){
//            lembretes.forEach(System.out::println);
//        }

//      ** Atualizar dado **
//        Lembrete lembrete = em.find(Lembrete.class,1L);
//        lembrete.setTitulo("Comprar guaraná");
//        lembrete.setDescricao("Hoje 19h");
//        try{
//            em.getTransaction().begin();
//            em.merge(lembrete);
//            em.getTransaction().commit();
//        }catch (Exception e){
//            em.getTransaction().rollback();
//        }finally {
//            em.close();
//        }

//        ** Remover **
//        Lembrete lembrete = em.find(Lembrete.class,1L);
//        try{
//            em.getTransaction().begin();
//            em.remove(lembrete);
//            em.getTransaction().commit();
//        }catch (Exception e){
//            em.getTransaction().rollback();
//        }finally {
//            em.close();
//        }
    }
}
