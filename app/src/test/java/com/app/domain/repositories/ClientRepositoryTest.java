package com.app.domain.repositories;

import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;
import com.app.infrastructure.config.DatabaseConfig;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClientRepositoryTest {}