package cl.lapila.cards.service.serviceimpl;

import cl.lapila.cards.entity.Card;
import cl.lapila.cards.repository.ICardRepository;
import cl.lapila.cards.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("cardImpl")
public class CardImpl implements ICardService {
    @Autowired
    ICardRepository objCardRepo;

    @Override
    public Card crearCard(Card card){
        return objCardRepo.save(card);
    }
    @Override
    public List<Card> listarCards(){
        return objCardRepo.findAll();
    }

    @Override
    public Card buscarCardPorId(int idCard){
        return objCardRepo.findById(idCard).orElseThrow(()-> new NoSuchElementException("Card no encontrada"));
    }

    @Override
    public Card actualizarCard(Card cardActualizar, int idCard){
        Card card = objCardRepo.findById(idCard).orElseThrow(()->new NoSuchElementException("Card no encontrada"));
        card.setNombre(cardActualizar.getNombre());
        card.setDescripcion(cardActualizar.getDescripcion());
        card.setColor(cardActualizar.getColor());
        card.setEstado(cardActualizar.getEstado());

        return objCardRepo.save(card);
    }

    @Override
    public void eliminarCard(int idCard) {
        objCardRepo.deleteById(idCard);
    }
}
