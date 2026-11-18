/// MACHINE GENERATED FILE, DO NOT EDIT.
#pragma once

#if defined(_WIN32)
#define _JPH_EXPORT __declspec(dllexport)
#elif defined(__GNUC__) && __GNUC__ >= 4
#define _JPH_EXPORT __attribute__((visibility("default")))
#else
#define _JPH_EXPORT
#endif

#if defined(__cplusplus)
#define _JPH_EXTERN extern "C"
#else
#define _JPH_EXTERN extern
#endif

#define JPH_CAPI _JPH_EXTERN _JPH_EXPORT

#include <stdbool.h>
#include <stdint.h>

typedef unsigned int uint;
typedef uint8_t uint8;
typedef uint16_t uint16;
typedef uint32_t uint32;
typedef int32_t int32;
typedef uint64_t uint64;
typedef int64_t int64;
typedef uint16 ObjectLayer;
typedef uint64 MutexMask;
typedef uint8 Type;
typedef uint32 GroupID;
typedef uint32 SubGroupID;

#include "JoltC_Enums.h"
#include "JoltC_Handles.h"
#include "JoltC_CallbackStructs.h"
