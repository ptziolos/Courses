import { createClient } from "@supabase/supabase-js";

const supabaseUrl = "https://jwgmjyoepshvfdpudrur.supabase.co";
const supabaseKey =
  "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imp3Z21qeW9lcHNodmZkcHVkcnVyIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDQ2MTE3NTcsImV4cCI6MjA2MDE4Nzc1N30.kOgPzDc25ybnf1Br9BCw9sayQSU4iJ8fGwgGN6zvHNc";
const supabase = createClient(supabaseUrl, supabaseKey);

export default supabase;
