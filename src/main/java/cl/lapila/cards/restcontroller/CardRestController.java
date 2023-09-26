package cl.lapila.cards.restcontroller;

import cl.lapila.cards.entity.Card;
import cl.lapila.cards.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/card")
public class CardRestController {
    @Autowired
    ICardService objCardService;

    @PostMapping
    public Card crearCard(@RequestBody Card card){
        return objCardService.crearCard(card);
    }

    @GetMapping("/{idCard}")
    public Card buscarCardPorId(@PathVariable int idCard){
        return objCardService.buscarCardPorId(idCard);
    }

    @GetMapping
    public List<Card>listarCards(){
        List<Card> cards = objCardService.listarCards();
        return cards;
    }

    @PutMapping("/{idCard}")
    public Card actualizarCard(@RequestBody Card cardActualizar, @PathVariable int idCard){
        return objCardService.actualizarCard(cardActualizar, idCard);
    }


    @DeleteMapping("/{idCard}")
    public void eliminarCard(@PathVariable int idCard){
        objCardService.eliminarCard(idCard);
    }


}
