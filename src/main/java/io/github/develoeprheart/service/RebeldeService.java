package io.github.develoeprheart.service;

import io.github.develoeprheart.repository.rebelde.Rebelde;
import io.github.develoeprheart.repository.rebelde.RebeldeRepository;
import org.hibernate.loader.entity.NaturalIdEntityJoinWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class RebeldeService {

    @Autowired
    private RebeldeRepository rebeldeRepository;

    public Rebelde save(Rebelde rebelde){
        try {
            if (rebelde.getId() == null){
                UUID id = UUID.fromString("ebd53694-c33c-4033-a54d-92c2238935c3");
                rebelde.setId(id);
                rebelde.getInventario().setId(id);
                rebelde.getLocalizacao().setId(id);
                System.out.println(rebelde);

            }
            System.out.println("de dentro do save" + rebelde);
            return  rebeldeRepository.saveAndFlush(rebelde);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Rebelde findById(UUID id){
        Optional<Rebelde> o = rebeldeRepository.findById(id);
        return o.orElse(null);

    }
}
