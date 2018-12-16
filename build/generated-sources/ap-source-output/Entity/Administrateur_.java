package Entity;

import Entity.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:39:10")
@StaticMetamodel(Administrateur.class)
public class Administrateur_ { 

    public static volatile SingularAttribute<Administrateur, String> idAdmin;
    public static volatile SingularAttribute<Administrateur, String> fonction;
    public static volatile SingularAttribute<Administrateur, Utilisateur> login;
    public static volatile SingularAttribute<Administrateur, String> nom;
    public static volatile SingularAttribute<Administrateur, String> prenom;

}