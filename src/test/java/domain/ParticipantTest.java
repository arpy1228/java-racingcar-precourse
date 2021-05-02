package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ParticipantTest {

    @Test
    @DisplayName("참가자 정상 케이스 테스트")
    public void participantSplitTest(){
        Participant participant = new Participant();
        participant.inputParticipants(Arrays.asList("test1", "test2"));
        assertThat(participant.getParticipants().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("참가자 비정상 케이스 테스트")
    public void participantSplitExcepionTest(){
        assertThrows(IllegalArgumentException.class,
                () -> new Participant().inputParticipants(Arrays.asList("test1", "test2easfs")));
    }

}