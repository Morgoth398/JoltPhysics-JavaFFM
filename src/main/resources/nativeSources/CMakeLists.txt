cmake_minimum_required(VERSION 4.0)

project(joltc CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

if (MSVC)
    set(CMAKE_MSVC_RUNTIME_LIBRARY "MultiThreaded$<$<CONFIG:Debug>:Debug>")
endif ()

add_library(joltc SHARED JoltC_Functions.cpp JoltC_Handwritten.cpp)

set(DEBUG_RENDERER_IN_DEBUG_AND_RELEASE ON  CACHE BOOL "" FORCE)
set(PROFILER_IN_DEBUG_AND_RELEASE       OFF CACHE BOOL "" FORCE)
set(USE_ASSERTS                         OFF CACHE BOOL "" FORCE)
set(TARGET_UNIT_TESTS                   OFF CACHE BOOL "" FORCE)
set(TARGET_HELLO_WORLD                  OFF CACHE BOOL "" FORCE)
set(TARGET_PERFORMANCE_TEST             OFF CACHE BOOL "" FORCE)
set(TARGET_SAMPLES                      OFF CACHE BOOL "" FORCE)
set(TARGET_VIEWER                       OFF CACHE BOOL "" FORCE)

add_subdirectory(JoltPhysics-5.7.0/Build)

target_link_libraries(joltc PRIVATE Jolt)

install(TARGETS joltc
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)