cmake_minimum_required(VERSION 4.0)

project(joltc CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

if (MSVC)
    set(CMAKE_MSVC_RUNTIME_LIBRARY "MultiThreaded$<$<CONFIG:Debug>:Debug>")
endif ()

add_library(joltc SHARED JoltC_Functions.cpp JoltC_Handwritten.cpp)

if (MSVC)
    target_compile_options(joltc PRIVATE /GR-)
else ()
    target_compile_options(joltc PRIVATE -fno-rtti)
endif ()

set(CMAKE_POSITION_INDEPENDENT_CODE     ON)

set(DEBUG_RENDERER_IN_DEBUG_AND_RELEASE ON  CACHE BOOL "" FORCE)
set(PROFILER_IN_DEBUG_AND_RELEASE       OFF CACHE BOOL "" FORCE)
set(USE_ASSERTS                         OFF CACHE BOOL "" FORCE)
set(TARGET_UNIT_TESTS                   OFF CACHE BOOL "" FORCE)
set(TARGET_HELLO_WORLD                  OFF CACHE BOOL "" FORCE)
set(TARGET_PERFORMANCE_TEST             OFF CACHE BOOL "" FORCE)
set(TARGET_SAMPLES                      OFF CACHE BOOL "" FORCE)
set(TARGET_VIEWER                       OFF CACHE BOOL "" FORCE)
set(CPP_RTTI_ENABLED                    OFF CACHE BOOL "" FORCE)

if (CMAKE_BUILD_TYPE STREQUAL "Debug")
    set(GENERATE_DEBUG_SYMBOLS ON CACHE BOOL "" FORCE)
else ()
    set(GENERATE_DEBUG_SYMBOLS OFF CACHE BOOL "" FORCE)
endif ()

add_subdirectory(JoltPhysics-5.7.0/Build EXCLUDE_FROM_ALL)

target_link_libraries(joltc PRIVATE Jolt)

install(TARGETS joltc
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)