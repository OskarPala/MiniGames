package miniGames.lottoGame.model;

import lombok.Data;

import java.util.Set;

@Data
public class LottoResult  {

    private final Set<Integer> userNumber;
    private final Set<Integer> randomNumber;
    private final Set<Integer> userHits;

}
