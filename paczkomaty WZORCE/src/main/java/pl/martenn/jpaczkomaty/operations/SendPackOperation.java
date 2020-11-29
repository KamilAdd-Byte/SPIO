package pl.martenn.jpaczkomaty.operations;

import lombok.RequiredArgsConstructor;
import pl.martenn.jpaczkomaty.machine.PackMachine;
import pl.martenn.jpaczkomaty.pack.Pack;
import pl.martenn.jpaczkomaty.transport.Transport;

@RequiredArgsConstructor
public class SendPackOperation implements PackOperation {

    private final Transport transport;
    private final PackMachine packMachine;

    @Override
    public void execute() {//Nadanie paczki
        Pack pack = transport.getPack();//stworzyć paczkę
        this.packMachine.put(pack); //do paczkomatu
        this.transport.setPlace(packMachine.getId());//odebrana paczka na podstawie Id paczkomatu
//      this.packMachine.clear();
        //
    }

}
