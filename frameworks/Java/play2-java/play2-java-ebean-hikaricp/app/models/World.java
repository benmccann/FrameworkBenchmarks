package models;

import com.avaje.ebean.Ebean;
import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class World extends Model {

    public static final Finder<Long, World> find = new Finder<>(World.class);

    @Id
    public Long id;

    @Column(name = "randomNumber")
    public Long randomNumber;

    public static World find(Long id) {
        return World.find(id);
    }

    public static List<World> save(final List<World> worlds) {
        worlds.forEach(Ebean::update);

        return worlds;
    }

}
