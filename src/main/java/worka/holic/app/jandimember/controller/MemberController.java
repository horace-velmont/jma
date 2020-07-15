package worka.holic.app.jandimember.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/member")
public class MemberController {
    private Map<String, String> memberMap;

    public MemberController() {
        this.memberMap = new HashMap<>();
        memberMap.put("1컴이", "horace-velmont");
    }

    @GetMapping("")
    public ResponseEntity<String> showMemberByName(@RequestParam("member_name") String memberName) {
        Optional<String> memberId = Optional.of(memberMap.get(memberName));
        return ResponseEntity.of(memberId);
    }
}
