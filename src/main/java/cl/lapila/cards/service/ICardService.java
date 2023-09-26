package cl.lapila.cards.service;

import cl.lapila.cards.entity.Card;

import java.util.List;

public interface ICardService {

    List<Card> listarCards();
    Card crearCard (Card card);
    Card buscarCardPorId (int idCard);

    Card actualizarCard (Card card, int idCard);

    public void eliminarCard (int idCard);
}
