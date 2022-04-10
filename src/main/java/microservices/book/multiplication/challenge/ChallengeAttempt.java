package microservices.book.multiplication.challenge;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class ChallengeAttempt {
	private Long id;
	private Long userId;
	private int factorA;
	private int factorB;
	private int resultAttempt;
	private boolean correct;
}
