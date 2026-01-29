package com.melof10.challengevaregos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Test de la clase ChallengeVaregosApplication
 */
@SpringBootTest
class ChallengeVaregosApplicationTests {

    /**
     * Test para la función main de mi API Rest
     */
    @Test
    void appTest() {
        ChallengeVaregosApplication.main(new String[]{});
        assertFalse(ChallengeVaregosApplication.class.getName().isBlank());
    }

}
