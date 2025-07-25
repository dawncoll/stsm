/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2025 Thymeleaf (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package thymeleaf.stsm.business.entities.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import thymeleaf.stsm.business.entities.SeedStarter;


@Repository
public class SeedStarterRepository {

    private final List<SeedStarter> seedStarters = new ArrayList<SeedStarter>();
    
    
    
    public SeedStarterRepository() {
        super();
    }
    
    
    
    public List<SeedStarter> findAll() {
        return new ArrayList<SeedStarter>(this.seedStarters);
    }

    
    public void add(final SeedStarter seedStarter) {
        this.seedStarters.add(seedStarter);
    }
    
    
    
}
