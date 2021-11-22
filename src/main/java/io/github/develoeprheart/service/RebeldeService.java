package io.github.develoeprheart.service;

import io.github.develoeprheart.repository.rebelde.Rebelde;
import io.github.develoeprheart.repository.rebelde.RebeldeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class RebeldeService {

    @Autowired
    private RebeldeRepository rebeldeRepository;

    public Rebelde save(Rebelde rebelde){
        try {
            if (rebelde.getId() == null){
                return rebeldeRepository.saveAndFlush(rebelde);
            }
//                UUID id = UUID.randomUUID();
//                rebelde.setId(id);
//                rebelde.getInventario().setId(id);
//                rebelde.getLocalizacao().setId(id);
//                System.out.println(rebelde);

//            }
            System.out.println("de dentro do save" + rebelde);
            return  rebeldeRepository.saveAndFlush(rebelde);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Rebelde findById(UUID id){
        Optional<Rebelde> o = rebeldeRepository.findById(id);
        Rebelde rebelde = new Rebelde();
        o.get().toString();

        rebelde.setId(o.get().getId());
        rebelde.setGenero(o.get().getGenero());
        rebelde.setNome(o.get().getNome());
        rebelde.setIdade(o.get().getIdade());
        rebelde.novaLocalizacao(o.get().getLocalizacao());
        rebelde.setInventario(o.get().getInventario());

        System.out.println(rebelde);
        return Objects.nonNull(rebelde)? rebelde : null;

    }
}
