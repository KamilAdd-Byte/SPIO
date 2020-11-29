package pl.martenn.jpaczkomaty.machine;

import pl.martenn.jpaczkomaty.box.Box;
import pl.martenn.jpaczkomaty.box.BoxGroup;
import pl.martenn.jpaczkomaty.pack.PackSize;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public class MachineFreeSpaceVisitor implements MachineVisitor {

    @Getter
    private Map<PackSize, Integer> quantities = new HashMap<>();

    public MachineFreeSpaceVisitor() {
        quantities.put(PackSize.A,0);
        quantities.put(PackSize.B,1);
        quantities.put(PackSize.C,2);
    }

    @Override
    public void visitBox(Box box) {
        if (quantities.isEmpty()){
            Integer integerValue = quantities.get(box.getSize()) + 1;
            quantities.put(box.getSize(),integerValue);
        }else
            System.err.println("BRAK MIEJSCA");
    }

    @Override
    public void visitBoxGroup(BoxGroup boxGroup) {


    }

    @Override
    public void visitPackMachine(PackMachine packMachine) {

    }

}
