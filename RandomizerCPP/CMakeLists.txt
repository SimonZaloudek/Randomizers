cmake_minimum_required(VERSION 3.26)
project(RandomizerCPP)

set(CMAKE_CXX_STANDARD 20)
set (CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -static-libstdc++ -static-libgcc")

add_executable(RandomizerCPP main.cpp
)
