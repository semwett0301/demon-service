package com.example.distributed_system.interfaces;

import com.example.distributed_system.entity.Demon;
import com.example.distributed_system.entity.Hell;
import com.example.distributed_system.entity.Human;

public interface DemonGeneratorService {
    // Генерирование нового демона
    Demon generate(Human human,  Hell hell);
}
