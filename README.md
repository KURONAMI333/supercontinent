# Supercontinent

> Overworld is one massive contiguous landmass. The ocean is near-zero — a thin boundary belt at the edges. Oceanic structures relocate to inland oasis lakes.

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![NeoForge 1.21.1](https://img.shields.io/badge/NeoForge-1.21.1-orange.svg)](https://neoforged.net)
[![Depends on Isekai API](https://img.shields.io/badge/Depends-Isekai%20API-9333ea)](https://github.com/KURONAMI333/isekai-api)

---

## Concept

Minecraft normally lets you sail off the edge of a landmass and find another. Supercontinent removes that experience entirely. The overworld is a *single* continent — tens of thousands of blocks across, all biomes meeting at internal borders rather than across coastlines. You can walk for in-game weeks without seeing the sea.

For players who want to "go inland", explore by foot/horse/cart for the long haul, and never run out of contiguous terrain.

## How it works

Supercontinent is built on **[Isekai API](https://github.com/KURONAMI333/isekai-api)**, a neutral universal worldgen library.

This is intended to be a **datapack-first consumer**: most of the worldshape is expressible in JSON using Isekai's density primitives (`add`, `distance`, `step`, `clamp`) and rule-adaptation primitives, with minimal Java code. It's the showcase for how lightly a consumer can lean on the library.

## Status

**v0.1**: skeleton. JSON datapack + minimal Java glue land with Isekai API v0.2.

## Dependencies

- NeoForge 1.21.1
- [Isekai API](https://github.com/KURONAMI333/isekai-api) (required)

## License

[MIT License](LICENSE) — modpack inclusion welcome, no credit required.

## Credits

- Author: KURONAMI
