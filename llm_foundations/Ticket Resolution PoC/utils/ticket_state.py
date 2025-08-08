from typing import Dict, Any
from pydantic import BaseModel

class TicketState(BaseModel):
    ticket_id: str
    status: str = "created"  # e.g., created, planning, resolving, needs_info, resolved, escalated
    history: list[str] = []
    context: Dict[str, Any] = {}
    interactions: list[str] = []
