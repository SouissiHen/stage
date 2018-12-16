package Entity;

import Entity.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:39:10")
@StaticMetamodel(Enseignant.class)
public class Enseignant_ { 

    public static volatile SingularAttribute<Enseignant, String> specialite;
    public static volatile SingularAttribute<Enseignant, String> codeInscript;
    public static volatile SingularAttribute<Enseignant, Utilisateur> login;
    public static volatile SingularAttribute<Enseignant, String> nom;
    public static volatile SingularAttribute<Enseignant, String> prenom;

}