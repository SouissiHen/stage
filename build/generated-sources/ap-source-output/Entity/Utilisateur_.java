package Entity;

import Entity.Administrateur;
import Entity.Enseignant;
import Entity.Etudiant;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:39:10")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> typeUtilisateur;
    public static volatile SingularAttribute<Utilisateur, String> password;
    public static volatile ListAttribute<Utilisateur, Administrateur> administrateurList;
    public static volatile ListAttribute<Utilisateur, Enseignant> enseignantList;
    public static volatile SingularAttribute<Utilisateur, String> login;
    public static volatile ListAttribute<Utilisateur, Etudiant> etudiantList;

}