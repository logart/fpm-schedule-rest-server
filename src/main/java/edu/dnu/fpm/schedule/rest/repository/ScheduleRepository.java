package edu.dnu.fpm.schedule.rest.repository;

import java.util.HashMap;
import java.util.Map;

import edu.dnu.fpm.schedule.domain.ScheduleTable;
import edu.dnu.fpm.schedule.rest.exceptions.ScheduleAlreadyExist;
import edu.dnu.fpm.schedule.rest.exceptions.ScheduleDoesNotExist;

/**
 * @author Artem Loginov (logart) logart2007@gmail.com
 *         Date: 8/11/12
 *         Time: 1:03 AM
 */
public class ScheduleRepository {

    private Map<String, ScheduleTable> repository = new HashMap<String, ScheduleTable>();

    public void put(ScheduleTable schedule){
        if (repository.get(schedule.getGroupName()) != null)
            throw new ScheduleAlreadyExist();

        repository.put(schedule.getGroupName(), schedule);
    }

    public ScheduleTable get(String id){
        if (repository.get(id)==null){
            throw new ScheduleDoesNotExist();
        }
        return repository.get(id);
    }

    public ScheduleTable[] getAll() {
        return repository.values().toArray(new ScheduleTable[repository.values().size()]);
    }
}
