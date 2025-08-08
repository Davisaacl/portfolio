from utils.ticket_state import TicketState

def knowledge_agent(state: TicketState) -> TicketState:
    state.history.append("Knowledge: Searching for related issues...")

    # Simulación de búsqueda en documentación
    issue_summary = state.context.get("issue_summary", "User cannot access VPN")

    # Simulamos respuesta del sistema de búsqueda
    similar_cases = [
        {"id": "KB102", "summary": "VPN issues due to DNS misconfig"},
        {"id": "TKT448", "summary": "Firewall blocked VPN port"},
    ]

    documentation = [
        "Check DNS settings for VPN resolution.",
        "Verify firewall allows outbound port 1194 (OpenVPN)."
    ]

    # Guardamos en el contexto
    state.context["knowledge_base"] = {
        "matches": similar_cases,
        "recommendations": documentation
    }

    state.history.append("Knowledge: Found similar issues and added recommendations.")
    return state
