cmake_minimum_required(VERSION 3.26)
project(RandomizerCPP2)

set(CMAKE_CXX_STANDARD 20)

add_executable(RandomizerCPP2 main.cpp
        menu.cpp
        menu.h
        generation.cpp
        generation.h
)
