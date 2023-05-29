package org.jetbrains.jewel.styles

class ControlStyle<TState, TAppearance>(
    configure: ControlStyleBuilder<TAppearance, TState>.() -> Unit
) : Map<TState, TAppearance> by ControlStyleBuilder<TAppearance, TState>().build(configure) {

    fun appearance(state: TState) = get(state)

    class ControlStyleBuilder<TAppearance, TState> {

        private val states = mutableMapOf<TState, TAppearance>()

        fun state(state: TState, appearance: TAppearance) {
            require(state !in states) { "State '$state' has already been registered" }
            states[state] = appearance
        }

        fun build(configure: ControlStyleBuilder<TAppearance, TState>.() -> Unit): Map<TState, TAppearance> {
            configure()
            return states
        }
    }
}
